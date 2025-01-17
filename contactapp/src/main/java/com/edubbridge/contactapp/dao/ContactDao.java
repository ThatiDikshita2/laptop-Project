package com.edubbridge.contactapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edubbridge.contactapp.dto.contact;
import com.edubbridge.contactapp.util.DBUtil;

public class ContactDao implements ContactDaoI {
	private static Connection con = null;
	static {
		con = DBUtil.getConnection();
	}

	@Override
	public int addContact(contact c) {
		String sql = "insert into contact(name,email,mobile) values(?,?,?)";
		int status = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, c.getName());
			ps.setString(2, c.getEmail());
			ps.setLong(3, c.getMobile());

			status = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<contact> getAllContacts() {
		String sql = "select * from contact";
		List<contact> contacts = new ArrayList<contact>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				contact c = new contact();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("Email"));
				c.setMobile(rs.getLong("Mobile"));
				contacts.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contacts;
	}

	@Override
	public contact getContactByName(String Name) {
		String sql = "select * from contact where name=?";
		contact c = null;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, Name);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				contact C = new contact();
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				c.setEmail(rs.getString("email"));
				c.setMobile(rs.getLong("mobile"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	@Override
	public int updateContact(contact c) {
		String sql = "update contact set Name=?,Email=?,Mobile=? where id=?";
		int status =0;
		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, c.getName());
		ps.setString(2, c.getEmail());
		ps.setLong(3, c.getMobile());
		ps.setInt(4, c.getId());
		status = ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return status;
	}

	@Override
	public int deleteContact(String name) {
		String sql = "delect from contact where name=?";
		int status = 0;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			status = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

}
