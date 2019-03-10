package com.a4455jkjh.apktool.service;

import java.util.ListResourceBundle;

public class Messages_zh extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return msg;
	}
	private static final String[][] msg ={
		{Messages.UNKNOWN_TYPE, "未知类型“{0}”"},
		{Messages.UNKNOWN_FIELD, "类型“{1}”不包含字段“{0}”"},
		{Messages.UNKNOWN_METHOD, "类型“{1}”不包含方法“{0}”"},
		{Messages.WRONG_NIBBLE_LITERAL, "无效数字“{0}”。必须在-8到7之间，包括7。"},
		{Messages.WRONG_BYTE_LITERAL, "无效数字“{0}”。必须在-128到127之间，包括127。"},
		{Messages.WRONG_INT_HAT_LITERAL, "无效数字“{0}”。低16位必需为0。"},
		{Messages.WRONG_LONG_HAT_LITERAL, "无效数字“{0}”. 低48位必需为0。"},
		{Messages.WRONG_SHORT_LITERAL, "无效数字“{0}”。必须在-32768到32767之间，包括32767。"},
		{Messages.VALUE_NOT_SHORT, "“{0}”不在short范围内！"},
		{Messages.NO_REGISTER, "没有“.register”或“.locals”语句！"},
		{Messages.WRONG_NIBBLE_REGISTER, "无效寄存器“{0}”。必须在v0到v15之间，包括v15。"},
		{Messages.WRONG_BYTE_REGISTER, "无效寄存器“{0}”。必须在v0到v255之间，包括v255。"},
		{Messages.WRONG_SHORT_REGISTER, "无效寄存器“{0}”。必须在v0到v65535之间，包括v65535。"},
		{Messages.WRONG_REGISTER_COUNT, "无效寄存器数量“{0}”。必须在0到255之间，包括255。"},
		{Messages.WRONG_REGISTER_COUNT1, "无效寄存器“{0}”。大于在“.register”或“.locals”指令中要求的最大值“{1}”"},
	};
}
