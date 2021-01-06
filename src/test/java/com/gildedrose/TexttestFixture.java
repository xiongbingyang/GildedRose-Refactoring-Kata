package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 3), //
                new Item("+5 Dexterity Vest", 2, 4), //
                new AgedItem("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80), //
                new SulfurasItem("Sulfuras, Hand of Ragnaros", -1, 80),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 12, 20),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 7, 30),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 11, 8),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 3, 68),
                new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 1, 20),
                // this conjured item does not work properly yet
                new ConjuredItem("Conjured Mana Cake", 3, 6) ,
                new ConjuredItem("Conjured Mana Cake", 2, 20) ,
        };

    GildedRose app = new GildedRose(items);

        int days = 5;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.update_quality();
        }
    }

}
