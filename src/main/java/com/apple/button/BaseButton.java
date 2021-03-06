package com.apple.button;

/**
 * 公众号开发自定义菜单基础类
 */
public class BaseButton {
    private String name;
    private String type;

    public BaseButton(String name) {
        this.name = name;
    }

    public BaseButton(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
