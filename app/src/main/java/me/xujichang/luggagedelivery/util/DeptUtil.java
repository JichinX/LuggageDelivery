package me.xujichang.luggagedelivery.util;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.xujichang.luggagedelivery.entity.Dept;

public class DeptUtil {
    public static final List<Dept> sDepts = new ArrayList<>();
    private static final Map<Long, Dept> sDeptHashMap = new HashMap<>();

    public static String getDept(List<Dept> pDepts, Long pStartDeptId) {
        return null;
    }

    public static String getDept(long id) {
        Dept vDept = sDeptHashMap.get(id);
        return null == vDept ? String.valueOf(id) : vDept.getName();
    }

    public static void patchDepts(ArrayList<Dept> pData) {
        if (null == pData) {
            return;
        }
        sDepts.clear();
        sDeptHashMap.clear();
        sDepts.addAll(pData);
        for (Dept vDatum : pData) {
            sDeptHashMap.put(vDatum.getId(), vDatum);
        }
    }

    public static int getIndex(long pIndex) {
        for (int vI = 0; vI < sDepts.size(); vI++) {
            if (pIndex == sDepts.get(vI).getId()) {
                return vI;
            }
        }
        return 0;
    }
}
