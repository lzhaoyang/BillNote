package com.lzy.gui.panel;

import com.lzy.gui.listener.BackupListener;
import com.lzy.gui.util.ColorUtil;
import com.lzy.gui.util.GUIUtil;

import javax.swing.*;

/**
 * Created by Administrator on 2017/8/24.
 */
public class BackupPanel extends AbstractWorkingPanel{
    static {
        GUIUtil.useLiquidSkin();
    }

    public static BackupPanel instance = new BackupPanel();
    JButton jButton = new JButton("备份");
    //无参构造方法
    public BackupPanel(){
        GUIUtil.setColor(ColorUtil.blueColor,jButton);
        this.add(jButton);
        //事件监听
        addListener();
    }

    //测试
    public static void main(String[] args){
        GUIUtil.showPanel(BackupPanel.instance);
    }

    @Override
    public void updateData() {

    }

    @Override
    public void addListener() {
        BackupListener backupListener = new BackupListener();
        jButton.addActionListener(backupListener);
    }
}
