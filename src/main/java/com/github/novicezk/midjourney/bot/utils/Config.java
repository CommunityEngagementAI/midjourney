package com.github.novicezk.midjourney.bot.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final String SEASON_VERSION = "SEASON_VERSION";
    private static final String DISCORD_BOT_TOKEN = "DISCORD_BOT_TOKEN";
    private static final String IMGBB_TOKEN = "IMGBB_TOKEN";

    private static final String CONFIG_FILE = "adam-ai/config.properties";
    private static final Properties properties = new Properties();

    static {
        try {
            properties.load(new FileInputStream(CONFIG_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getSeasonVersion() {
        return Integer.parseInt(properties.getProperty(SEASON_VERSION));
    }

    public static String getDiscordBotToken() {
        return properties.getProperty(DISCORD_BOT_TOKEN);
    }

    public static String getImgbbToken() {
        return properties.getProperty(IMGBB_TOKEN);
    }
}
