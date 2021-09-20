package com.addressbookjdbctest;

import org.junit.Test;

import java.sql.SQLException;

import org.junit.Assert;

import com.addressbookjdbc.AddressBookService;

public class AddressBookTest {
	
	public AddressBookService addressBookService;
	
	@Test
	public void ifData_WhenConnected_ShouldReturnSize() throws SQLException {
		addressBookService = new AddressBookService();
		int res = addressBookService.getQuery();
		Assert.assertEquals(6, res);
	}
	
	
}
