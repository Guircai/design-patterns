package com.guircai.design.structural.adapter.clazz;

import com.guircai.design.structural.adapter.Player;
import com.guircai.design.structural.adapter.Zh_EnTranslator;

/**
 * 继承的方式：类结构型，适配转换到了翻译器的功能上
 */
public class EnMoviePlayerAdapter extends Zh_EnTranslator implements Player{

    private Player target;  // 被适配对象
    public EnMoviePlayerAdapter(Player target) {
        this.target = target;
    }

    public String play() {
        String play = target.play();
        // 转换字幕
        String translate = translate(play);
        System.out.println("英文" + translate);
        return null;
    }
}
