package rocks.zipcode.io.comparators;

import java.util.Comparator;

import rocks.zipcode.io.Item;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator {

    public IdComparator() {
        Comparator<Item> comparator = Comparator.comparing(Item::getId);
    }
}
