#!/usr/bin/env python3

import argparse
import os

import tomllib


def generate_maven_dependencies(toml_file):
    with open(toml_file, "rb") as f:
        toml_data = tomllib.load(f)
    versions = toml_data["versions"]
    libraries = toml_data["libraries"]
    result = []
    for library, library_data in libraries.items():
        if "version" in library_data:
            version = versions[library_data["version"]["ref"]]
        else:
            # Skip over BOMs. Will manually add them later.
            continue

        module = library_data["module"]
        group, artifact = module.split(":")

        result.append(
            f'maven_dependency(name = "{library}", group = "{group}", artifact = "{artifact}", version = "{version}", visibility = ["PUBLIC"])'
        )
    return "\n".join(result)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--toml_file", required=True, help="The TOML file to parse")
    parser.add_argument(
        "--output_file", required=True, help="The output file to write to"
    )
    args = parser.parse_args()

    toml_file = args.toml_file
    output_file = args.output_file

    if not os.path.exists(toml_file):
        raise FileNotFoundError(f"File {toml_file} does not exist")

    output_dir = os.path.dirname(output_file)
    if output_dir:
        os.makedirs(output_dir, exist_ok=True)

    with open(output_file, "w") as f:
        f.write('load("//third_party:maven.bzl", "maven_dependency")\n\n')
        f.write(generate_maven_dependencies(toml_file))
