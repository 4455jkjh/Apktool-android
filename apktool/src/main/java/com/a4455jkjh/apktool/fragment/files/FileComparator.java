package com.a4455jkjh.apktool.fragment.files;

import java.io.File;
import java.util.Comparator;

public enum FileComparator implements Comparator<File>{
	NAME{
		public int compare(File f1, File f2){
			return f1.getName().toLowerCase().
				compareTo(f2.getName().toLowerCase());
		}
	},
	NAME_REVERSE{
		public int compare(File f1, File f2){
			return NAME.compare(f2,f1);
		}
	},
	TYPE{
		public int compare(File f1, File f2){
			int i = getType(f1).compareTo(getType(f2));
			if(i==0)
				return NAME.compare(f1,f2);
			return i;
		}
	},
	TYPE_REVERSE{
		public int compare(File f1, File f2){
			return TYPE.compare(f2,f1);
		}
	},
	SIZE{
		public int compare(File f1, File f2){
			long l = f1.length()-f2.length();
			if(l>0)
				return 1;
			if(l<0)
				return -1;
			return NAME.compare(f1,f2);
		}
	},
	SIZE_REVERSE{
		public int compare(File f1, File f2){
			return SIZE.compare(f2,f1);
		}
	},
	TIME{
		public int compare(File f1, File f2){
			long l = f1.lastModified()-f2.lastModified();
			if(l>0)
				return 1;
			if(l<0)
				return -1;
			return NAME.compare(f1,f2);
		}
	},
	TIME_REVERSE{
		public int compare(File f1, File f2){
			return TIME.compare(f2,f1);
		}
	};

	public static void setDefaultAdapter(FileComparator defaultAdapter)
	{
		FileComparator.defaultAdapter = defaultAdapter;
	}
	public static void setDefaultAdapter(int defaultAdapter)
	{
		setDefaultAdapter(values()[defaultAdapter]);
	}
	public static FileComparator getDefaultAdapter()
	{
		return defaultAdapter;
	}
	private static FileComparator defaultAdapter = NAME;
	public int compare(File f1, File f2){
		return 0;
	}
	private static String getType(File f){
		String n = f.getName();
		int i = n.lastIndexOf('.');
		if(i==-1)
			return "";
		return n.substring(i+1);
	}
}
