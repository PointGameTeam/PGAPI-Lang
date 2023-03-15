package io.xiaoyi311.pointgame.langapi;

/**
 * 语言信息
 * @author Xiaoyi311
 */
public class LangInfo {
    /**
     * 语言名称
     */
    public final String langName;

    /**
     * 语言本地名
     */
    public final String lang;

    /**
     * 语言切换
     */
    public final String change;

    /**
     * 语言切换简介
     */
    public final String changeDes;

    /**
     * 语言图标
     */
    public final String icon;

    /**
     * 实例化
     */
    public LangInfo(String langName, String lang, String changeDes, String change, String icon){
        this.changeDes = changeDes;
        this.langName = langName;
        this.change = change;
        this.lang = lang;
        this.icon = icon;
    }
}
