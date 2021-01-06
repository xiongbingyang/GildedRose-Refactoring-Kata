package com.gildedrose;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;
import org.approvaltests.Approvals;

import java.sql.Array;
import java.util.ArrayList;

public class GildedRoseTest {

    @Test
    public void foo() {

        CombinationApprovals.verifyAllCombinations(this::doUpdateQuality,
                new String[]{"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"},
                new Integer[]{-1, 0, 1, 11, 6},
                new Integer[]{0, 49, 50, 60, 1});
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {

        Item[] items = new Item[] {new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.update_quality();
        return app.items[0].toString();
    }
}
