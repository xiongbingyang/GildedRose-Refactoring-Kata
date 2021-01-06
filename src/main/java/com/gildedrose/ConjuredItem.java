package com.gildedrose;

public class ConjuredItem extends Item {

    public ConjuredItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    protected void updateQualityAction() {
        this.quality = this.quality - 2;
        //更新保质期
        this.sell_in --;
        if (this.sell_in < 0) {
            // 过了保质期，以4倍的速度下滑
            this.quality = this.quality - 2;
        }
        sureQualityValue();
    }
}
