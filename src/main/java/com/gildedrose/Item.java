package com.gildedrose;

public class Item {

    public String name;

    public int sell_in;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
        //确保价值区间
        sureQualityValue();
    }

    /// 更新商品的质量
    protected void updateQualityAction() {
        this.quality --;
        //更新保质期
        this.sell_in --;
        if (this.sell_in < 0) {
            // 过了保质期，以双倍的速度下滑
            this.quality --;
        }
        sureQualityValue();
    }

    /// 确保商品价值不会越界
    protected void sureQualityValue() {
        this.quality = Math.min(this.quality, 50);
        this.quality = Math.max(this.quality, 0);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }
}
