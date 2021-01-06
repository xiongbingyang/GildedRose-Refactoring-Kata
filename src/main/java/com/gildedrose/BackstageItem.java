package com.gildedrose;

public class BackstageItem extends Item {

    public BackstageItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    protected void updateQualityAction() {
        if (this.sell_in > 0) {
            if (this.sell_in >= 11) {
                this.quality ++;
            } else  {
                if (this.sell_in >= 6) {
                    this.quality = this.quality + 2;
                } else  {
                    this.quality = this.quality + 3;
                }
            }
        }
        //更新保质期
        this.sell_in --;
        if (this.sell_in < 0) {
            this.quality = 0;
        }
        sureQualityValue();
    }
}
