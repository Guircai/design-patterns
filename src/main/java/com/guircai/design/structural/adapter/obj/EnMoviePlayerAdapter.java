package com.guircai.design.structural.adapter.obj;

import com.guircai.design.structural.adapter.Player;
import com.guircai.design.structural.adapter.Zh_EnTranslator;
import com.guircai.design.structural.adapter.Translator;

/**
 * 客户调用方法的时候用设配器操作即可
 * 
 * 类结构型模式
 * 对象结构型模式
 */
public class EnMoviePlayerAdapter implements Player {

    private Translator translator = new Zh_EnTranslator();
    private Player target;  // 被适配对象
    public EnMoviePlayerAdapter(Player target) {
        this.target = target;
    }

    public String play() {
        String play = target.play();
        // 转换字幕
        String translate = translator.translate(play);
        System.out.println("英文" + translate);
        return null;
    }
}
