package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public class StorageStub implements Storage {
    
    public static final String EMPTY_PATH = "<No File>";

    public StorageStub() {
        
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return new AddressBook();
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        return EMPTY_PATH;
    }

}
