package main;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public class SortedList {
        public static List<Integer> merge_sorted(
                List<Integer> sList1, List<Integer> sList2) {

            List<Integer> mergedSortedList = new ArrayList<>();
            int idx1 = 0;
            int idx2 = 0;

            while (idx1 < sList1.size() && idx2 < sList2.size()) {
                if (sList1.get(idx1) <= sList2.get(idx2)) {
                    mergedSortedList.add(sList1.get(idx1));
                    idx1++;
                } else {
                    mergedSortedList.add(sList2.get(idx2));
                    idx2++;
                }
            }

            return mergedSortedList;
        }
    }
}

