/*
 * Copyright (c) 2018 IPS, All rights reserved.
 *
 * The contents of this file are subject to the terms of the Apache License, Version 2.0.
 * Release: v1.0, By IPS, 2021.01.
 *
 */
package rdbms.DBMeter;

import java.io.Serializable;

/**
 * Table item
 * 
 * @version 1.0
 */
public class TableItem implements Serializable {
	private static final long serialVersionUID = 8912922593869347031L;
	public int i_id; // PRIMARY KEY
	public int i_im_id;
	public float i_price;
	public String i_name;
	public String i_data;

	public String toString() {
		StringBuffer desc = new StringBuffer();
		desc.append("\n***************** Item ********************");
		desc.append("\n*    i_id = " + i_id);
		desc.append("\n*  i_name = " + i_name);
		desc.append("\n* i_price = " + i_price);
		desc.append("\n*  i_data = " + i_data);
		desc.append("\n* i_im_id = " + i_im_id);
		desc.append("\n*******************************************");
		return desc.toString();
	}
}
