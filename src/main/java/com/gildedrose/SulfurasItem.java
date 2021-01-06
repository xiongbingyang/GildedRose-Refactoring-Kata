package com.gildedrose;

public class SulfurasItem extends Item {

    public SulfurasItem(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    protected void updateQualityAction() {
        //覆盖父类方法
        // 萨弗拉斯（Sulfuras）是一种传奇商品，没有保质期的概念，质量也不会下滑
    }
}
