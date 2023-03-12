package io.xiaoyi311.pointgame.langapi;

import java.util.List;

/**
 * 语言 API
 * @author Xiaoyi311
 */
public interface ILangManager {
    /**
     * 获取信息
     *
     * @param uuid 玩家名
     * @param path 数据路径
     * @return     信息
     */
    String getMsg(String uuid, String path);

    /**
     * 获取语言信息列表
     *
     * @return 语言信息列表
     */
    List<LangInfo> getInfos();
}
