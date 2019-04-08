package com.a4455jkjh.apktool.service;
import java.util.ListResourceBundle;

public class Messages extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return msg;
	}
	public static final String UNKNOWN_TYPE = "1";
	public static final String UNKNOWN_FIELD = "2";
	public static final String UNKNOWN_METHOD = "3";
	public static final String WRONG_NIBBLE_LITERAL = "4";
	public static final String WRONG_INT_HAT_LITERAL = "5";
	public static final String WRONG_LONG_HAT_LITERAL = "6";
	public static final String WRONG_SHORT_LITERAL = "7";
	public static final String VALUE_NOT_SHORT = "8";
	public static final String NO_REGISTER = "9";
	public static final String WRONG_NIBBLE_REGISTER = "10";
	public static final String WRONG_BYTE_REGISTER = "11";
	public static final String WRONG_SHORT_REGISTER = "12";
	public static final String WRONG_BYTE_LITERAL = "13";
	public static final String WRONG_REGISTER_COUNT = "14";
	public static final String WRONG_REGISTER_COUNT1 = "15";
	private static final String[][] msg ={
		{Messages.UNKNOWN_TYPE, "Unknown type {0}"},
		{Messages.UNKNOWN_FIELD, "Unknown field {0} of type {1}"},
		{Messages.UNKNOWN_METHOD, "Unknown method {0} of type {1}"},
		{Messages.WRONG_NIBBLE_LITERAL, "Invalid literal value: {0}. Must be between -8 and 7, inclusive."},
		{Messages.WRONG_BYTE_LITERAL, "Invalid literal value: {0}. Must be between -128 and 127, inclusive."},
		{Messages.WRONG_INT_HAT_LITERAL, "Invalid literal value: {0}. Low 16 bits must be zeroed out."},
		{Messages.WRONG_SHORT_LITERAL, "Invalid literal value: {0}. Must be between -32768 and 32767, inclusive."},
		{Messages.VALUE_NOT_SHORT, "{0} cannot fit into a short."},
		{Messages.NO_REGISTER, "There is no '.register' or '.locals' directive defined!"},
		{Messages.WRONG_NIBBLE_REGISTER, "Invalid register: {0}. Must be between v0 and v15, inclusive."},
		{Messages.WRONG_BYTE_REGISTER, "Invalid register: {0}. Must be between v0 and v255, inclusive."},
		{Messages.WRONG_SHORT_REGISTER, "Invalid register: {0}. Must be between v0 and v65535, inclusive."},
		{Messages.WRONG_REGISTER_COUNT, "Invalid register count: {0}. Must be between 0 and 255, inclusive."},
		{Messages.WRONG_REGISTER_COUNT1, "Invalid register: {0}. the value is greater than the max {1} defind in '.register' or '.locals' directive."},
	};
}
