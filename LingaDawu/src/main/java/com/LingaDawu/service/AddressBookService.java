package com.LingaDawu.service;

import com.LingaDawu.common.R;
import com.LingaDawu.entity.AddressBook;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AddressBookService extends IService<AddressBook> {
    R<AddressBook> setDefault(@RequestBody AddressBook addressBook);


    R<AddressBook> getDefault();

    R<List<AddressBook>> list(AddressBook addressBook);


}
