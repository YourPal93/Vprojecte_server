package com.friend.your.vprojecte.utility;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public class PageUtil<E extends Object> {

    public static <T> Page<T>  pageFromList(int pageNo, int pageSize, List<T> items) {
        int start = pageNo * pageSize;
        int end = start + pageSize;

        if(end > items.size()) {
            end = items.size();
        }

        List<T> itemsSubList = items.subList(start, end);

        Page<T> page = new PageImpl<>(itemsSubList, PageRequest.of(pageNo, pageSize), items.size());

        return page;
    }
}
