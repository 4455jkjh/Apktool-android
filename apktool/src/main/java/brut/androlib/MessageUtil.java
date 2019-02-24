package brut.androlib;
import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.logging.Logger;

public class MessageUtil {
	private static final ResourceBundle rb;

	public static final String ANDROLIB_COPY_RAW_FILE            = "1";
	public static final String ANDROLIB_BAKSMALI                 = "2";
	public static final String ANDROLIB_COPY_RAW_MANIFEST        = "3";
	public static final String ANDROLIB_COPY_RAW_RESOURCES       = "4";
	public static final String ANDROLIB_COPY_ASSETS_AND_LIBS     = "5";
	public static final String ANDROLIB_COPY_UNKNOWN_FILES       = "6";
	public static final String ANDROLIB_COPY_ORIGINAL_FILES      = "7";
	public static final String ANDROLIB_SHOW_VERSION             = "8";
	public static final String ANDROLIB_BUILT_APK                = "9";
	public static final String ANDROLIB_COPY_TWO_ARG_FILE        = "a";
	public static final String ANDROLIB_CHECK_SOURCES            = "b";
	public static final String ANDROLIB_SMALI_FOLDER             = "c";
	public static final String ANDROLIB_CHECK_RESOURCES          = "d";
	public static final String ANDROLIB_BUILD_RESOURCES          = "e";
	public static final String ANDROLIB_COPY_RAW_ANDROIDMANIFEST = "f";
	public static final String ANDROLIB_BUILD_ANDROIDMANIFEST    = "g";
	public static final String ANDROLIB_COPY_LIBS                = "h";
	public static final String ANDROLIB_COPY_META                = "i";
	public static final String ANDROLIB_COPY_UNKNOWN_FILES_DIR   = "j";
	public static final String ANDROLIB_BUILD_APK                = "k";
	public static final String APKDECODER_SHOW_VERSION           = "l";
	public static final String ANDROLIBRESOURCES_LOAD_TABLE      = "m";
	public static final String ANDROLIBRESOURCES_LOAD_TABLE_FROM = "n";
	public static final String ANDROLIBRESOURCES_DECODE_MANIFEST = "o";
	public static final String ANDROLIBRESOURCES_REGULAR_MANIFEST= "p";
	public static final String ANDROLIBRESOURCES_RENAME_MANIFEST = "q";
	public static final String ANDROLIBRESOURCES_DECODE_MANIFEST1= "r";
	public static final String ANDROLIBRESOURCES_DECODE_FILES    = "s";
	public static final String ANDROLIBRESOURCES_DECODE_VALUES   = "t";
	public static final String ANDROLIBRESOURCES_REMOVE_APK      = "u";
	public static final String ANDROLIBRESOURCES_INSTALL_FRAME   = "v";
	public static final String ARSCDECODER_DECODE_SHARED         = "w";
	public static final String ARSCDECODER_SPARSE_TYPE           = "x";
	public static final String ARSCDECODER_DEFAULT_PACKAGE       = "y";
	public static final String COPY_FILE_WITH_METHOD             = "z";
	public static final String AAPT2_COMPILE_RUN                 = "A";
	public static final String AAPT2_LINK_RUN                    = "B";
	public static final String AAPT_COMMAND_RUN                  = "C";
	public static final String SEVERE1                           = "D";
	public static final String SEVERE2                           = "E";
	public static final String SEVERE3                           = "F";
	public static final String COULD_NOT_FIND_SOURCE             = "G";
	public static final String COULD_NOT_FIND_RESOURCE           = "H";
	public static final String PATSE_MANIFEST_FAILED             = "I";
	public static final String SKIP_PACKAGE_GROUP                = "J";
	public static final String SET_DEFAULT_AAPT                  = "L";
	public static final String EMPTY_FRAME_FAILED                = "M";
	public static final String MORE_THAN_ONE_FRAME               = "N";
	public static final String INVALID_ORIENTATION               = "O";
	public static final String INVALID_TOUCHSCREEN               = "P";
	public static final String INVALID_DENSITY                   = "Q";
	public static final String INVALID_KEYBOARD                  = "R";
	public static final String INVALID_NAVIGATION                = "S";
	public static final String MULTIPLE_TYPE                     = "T";
	public static final String REPORT_FIX                        = "U";
	public static final String DECTED_UNKNOWN_DATA               = "V";
	public static final String DECTED_INVALID_DATA               = "W";
	public static final String INVALID_CONFIG                    = "X";
	public static final String INVALID_CONFIG_DROP               = "Y";
	public static final String DUPLICATE_RESOURCES               = "Z";
	public static final String JAXP_1_5_NOT_SUPPORT              = "0";
	public static final String UNKNOWN_TYPE                      = "01";

	private static String getText(String id, Object... args) {
		String text = rb.getString(id);
		return MessageFormat.format(text, args);
	}
	public static void info(Logger logger, String id, Object... args) {
		logger.info(getText(id, args));
	}

	public static void fine(Logger logger, String id, Object... args) {
		logger.fine(getText(id, args));
	}
	public static void warning(Logger logger, String id, Object... args) {
		logger.warning(getText(id, args));
	}

	public static void severe(Logger logger, String id, Object... args) {
		logger.severe(getText(id, args));
	}
	static{
		rb = ResourceBundle.getBundle(Messages.class.getName());
	}
}
