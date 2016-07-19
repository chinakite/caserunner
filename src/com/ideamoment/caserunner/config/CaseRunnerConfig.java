package com.ideamoment.caserunner.config;

import com.ideamoment.caserunner.CaseRunnerException;
import com.ideamoment.caserunner.CaseRunnerExceptionCode;
import com.ideamoment.config.IdeaConfiguration;

/**
 * Created by zhangzhonghua on 2016/7/19.
 */
public class CaseRunnerConfig {

    private static IdeaConfiguration config = new IdeaConfiguration();

    private static final String DEFAULT_CONFIG_FILENAME = "caserunner.properties";

    public synchronized static void initConfig(String configPath) {
        if(!config.isInited()) {
            config.initConfig(configPath);
        }else{
            throw new CaseRunnerException(CaseRunnerExceptionCode.CONFIG_ERROR, "Duplicate init config file");
        }
    }

    /**
     * Return a String property with a default value.
     */
    public static String get(String key, String defaultValue) {
        if(!config.isInited()) {
            initConfig(DEFAULT_CONFIG_FILENAME);
        }
        return config.get(key, defaultValue);
    }

    /**
     * Return a int property with a default value.
     */
    public static int getInt(String key, int defaultValue) {
        if(!config.isInited()) {
            initConfig(DEFAULT_CONFIG_FILENAME);
        }
        return config.getInt(key, defaultValue);
    }

    /**
     * Return a long property with a default value.
     */
    public static long getLong(String key, long defaultValue) {
        if(!config.isInited()) {
            initConfig(DEFAULT_CONFIG_FILENAME);
        }
        return config.getLong(key, defaultValue);
    }

    /**
     * Return a boolean property with a default value.
     */
    public static boolean getBoolean(String key, boolean defaultValue) {
        if(!config.isInited()) {
            initConfig(DEFAULT_CONFIG_FILENAME);
        }
        return config.getBoolean(key, defaultValue);
    }
}
