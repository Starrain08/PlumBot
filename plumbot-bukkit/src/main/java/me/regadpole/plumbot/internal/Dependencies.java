package me.regadpole.plumbot.internal;

import me.regadpole.plumbot.config.Args;
import me.regadpole.plumbot.internal.maven.MavenLibraries;
import me.regadpole.plumbot.internal.maven.MavenLibrary;

import static me.regadpole.plumbot.internal.Dependencies.*;

@MavenLibraries({
        @MavenLibrary(groupId = hutool.groupId, artifactId = hutool.artifactId, version = hutool.version),
        @MavenLibrary(groupId = ws.groupId, artifactId = ws.artifactId, version = ws.version),
        @MavenLibrary(groupId = juint.groupId, artifactId = juint.artifactId, version = juint.version),
        @MavenLibrary(groupId = fastjson.groupId, artifactId = fastjson.artifactId, version = fastjson.version),
        @MavenLibrary(groupId = common.groupId, artifactId = common.artifactId, version = common.version),
        @MavenLibrary(groupId = lombok.groupId, artifactId = lombok.artifactId, version = lombok.version)})
public class Dependencies {
    public static class hutool{
        public static final String groupId = "cn.hutool";
        public static final String artifactId = "hutool-all";
        public static final String version = "5.8.21";

    }
    public static class ws{
        public static final String groupId = "org.java-websocket";
        public static final String artifactId = "Java-WebSocket";
        public static final String version = "1.5.3";
    }
    public static class juint{
        public static final String groupId = "junit";
        public static final String artifactId = "junit";
        public static final String version = "4.13.2";
    }
    public static class fastjson{
        public static final String groupId = "com.alibaba";
        public static final String artifactId = "fastjson";
        public static final String version = "2.0.32";
    }
    public static class common{
        public static final String groupId = "org.apache.commons";
        public static final String artifactId = "commons-lang3";
        public static final String version = "3.12.0";
    }
    public static class lombok{
        public static final String groupId = "org.projectlombok";
        public static final String artifactId = "lombok";
        public static final String version = "1.18.26";
    }

}
