package me.regadpole.plumbot.internal;

import java.io.File;
import java.util.List;

public class Config {
    public static File PluginDir;

    public static class bot{ // bot
        public static String Ver; // version

        public static class Bot{
            public static String HTTP; // bot's HTTP
            public static String Token; // bot's Token
            public static boolean IsAccessToken; // bot's IsAccessToken
            public static int ListenPort; // bot's ListenPort
        }
        public static List<Long> Groups; // group's number
        public static List<Long> Admins; // admin's QQ
    }

    public static class config{ // bot
        public static String Ver; // version
        public static boolean Forwarding; // 消息转发
        public static boolean JoinAndLeave; // 进出游戏
        public static boolean Online; // 在线人数
        public static boolean SDR; // 自定义回复
        public static String Maven; // Maven仓库地址

    }

    public static class returns{ // commands
        public static String Ver; // version

    }
}
