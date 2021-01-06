package com.gildedrose;

public class AgedItem extends Item {

    public AgedItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    protected void updateQualityAction() {
        // 先加价值
        this.quality ++;
        // 更新保质期
        this.sell_in --;
        if (this.sell_in < 0) {
            //小于0再加1
            this.quality ++;
        }
        sureQualityValue();
    }
}
