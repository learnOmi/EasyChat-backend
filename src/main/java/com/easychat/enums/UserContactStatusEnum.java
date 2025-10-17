package com.easychat.enums;

import com.easychat.utils.StringTools;

public enum UserContactStatusEnum {
    NOT_FRIEND(0, "未添加"),
    FRIEND(1, "好友"),
    DEL(2, "已删除"),
    DEL_BE(3, "已被删除"),
    BLACKLIST(4, "已拉黑"),
    BLACKLIST_BE(5, "被拉黑");

    private Integer status;
    private String desc;

    UserContactStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static UserContactStatusEnum getByStatus(Integer status) {
        for (UserContactStatusEnum statusEnum : UserContactStatusEnum.values()) {
            if (statusEnum.getStatus().equals(status)) {
                return statusEnum;
            }
        }
        return null;
    }

    public static UserContactStatusEnum getByStatus(String status) {
        try {
            if (StringTools.isEmpty(status)) {
                return null;
            }
            return UserContactStatusEnum.valueOf(status.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
