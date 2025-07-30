def maven_dependency(name, group, artifact, version, visibility=None, sha1="da39a3ee5e6b4b0d3255bfef95601890afd80709", repository=None, extension="jar"):
    location = "%s:%s:%s:%s" % (group, artifact, extension, version)
    url = "mvn:" + location
    
    # If repository is specified, use it
    if repository:
        if repository == "google":
            url = "mvn:https:maven.google.com:" + location
        elif repository == "central":
            url = "mvn:https:repo1.maven.org/maven2:" + location
    
    native.remote_file(
        name = name + "_mvn", #_mvn suffix to avoid collision with prebuilt_jar
        url = url,
        out = name + "." + extension,
        sha1 = sha1,
    )
    native.prebuilt_jar(
        name = name,
        binary_jar = ":" + name + "_mvn",
        visibility = visibility,
    )
