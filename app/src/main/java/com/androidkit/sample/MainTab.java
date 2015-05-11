package com.androidkit.sample;

public enum MainTab {

    DYNAMIC(R.string.main_tab_name_dynamic, R.drawable.ic_main_tab_my_expert, MyExpertFragment.class),
    MY(R.string.main_tab_name_my, R.drawable.ic_main_tab_my_expert, MyFragment.class);

    private int tag;
    private int resIcon;
    private Class<?> clazz;

    MainTab(int resName, int resIcon, Class<?> clz) {
        this.tag = resName;
        this.resIcon = resIcon;
        this.clazz = clz;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }
}