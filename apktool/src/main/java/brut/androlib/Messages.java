package brut.androlib;
import java.util.ListResourceBundle;

public class Messages extends ListResourceBundle {

	private Object[][] contents = {
		{MessageUtil.ANDROLIB_COPY_RAW_FILE,              "Copying raw {0} file..."},
		{MessageUtil.ANDROLIB_BAKSMALI,                   "Baksmaling {0}..."},
		{MessageUtil.ANDROLIB_COPY_RAW_MANIFEST,          "Copying raw manifest..."},
		{MessageUtil.ANDROLIB_COPY_RAW_RESOURCES,         "Copying raw resources..."},
		{MessageUtil.ANDROLIB_COPY_UNKNOWN_FILES,         "Copying unknown files..."},
		{MessageUtil.ANDROLIB_COPY_ORIGINAL_FILES,        "Copying original files..."},
		{MessageUtil.ANDROLIB_SHOW_VERSION,               "Using Apktool {0}"},
		{MessageUtil.ANDROLIB_BUILT_APK,                  "Built apk..."},
		{MessageUtil.ANDROLIB_COPY_TWO_ARG_FILE,          "Copying {0} {1} file..."},
		{MessageUtil.ANDROLIB_CHECK_SOURCES,              "Checking whether sources has changed..."},
		{MessageUtil.ANDROLIB_SMALI_FOLDER,               "Smaling {0} folder into {1}..."},
		{MessageUtil.ANDROLIB_CHECK_RESOURCES,            "Checking whether resources has changed..."},
		{MessageUtil.ANDROLIB_BUILD_RESOURCES,            "Building resources..."},
		{MessageUtil.ANDROLIB_COPY_RAW_ANDROIDMANIFEST,   "Copying raw AndroidManifest.xml..."},
		{MessageUtil.ANDROLIB_BUILD_ANDROIDMANIFEST,      "Building AndroidManifest.xml..."},
		{MessageUtil.ANDROLIB_COPY_LIBS,                  "Copying libs... (/{0})"},
		{MessageUtil.ANDROLIB_COPY_META,                  "Copy META-INF..."},
		{MessageUtil.ANDROLIB_COPY_UNKNOWN_FILES_DIR,     "Copying unknown files/dir..."},
		{MessageUtil.ANDROLIB_BUILD_APK,                  "Building apk file..."},
		{MessageUtil.APKDECODER_SHOW_VERSION,             "Using Apktool {0} on {1}"},

		{MessageUtil.ANDROLIBRESOURCES_LOAD_TABLE,        "Loading resource table..."},
		{MessageUtil.ANDROLIBRESOURCES_LOAD_TABLE_FROM,   "Loading resource table from file: {0}"},
		{MessageUtil.ANDROLIBRESOURCES_DECODE_MANIFEST,   "Decoding AndroidManifest.xml with only framework resources..."},
		{MessageUtil.ANDROLIBRESOURCES_REGULAR_MANIFEST,  "Regular manifest package..."},
		{MessageUtil.ANDROLIBRESOURCES_RENAME_MANIFEST,   "Renamed manifest package found! Replacing {0} with {1}"},
		{MessageUtil.ANDROLIBRESOURCES_DECODE_MANIFEST1,  "Decoding AndroidManifest.xml with resources..."},
		{MessageUtil.ANDROLIBRESOURCES_DECODE_FILES,      "Decoding file-resources..."},
		{MessageUtil.ANDROLIBRESOURCES_DECODE_VALUES,     "Decoding values */* XMLs..."},
		{MessageUtil.ANDROLIBRESOURCES_REMOVE_APK,        "Removing {0} framework file..."},
		{MessageUtil.ANDROLIBRESOURCES_INSTALL_FRAME,     "Framework installed to: {0}"},

		{MessageUtil.ARSCDECODER_DECODE_SHARED,           "Decoding Shared Library ({0}), pkgId: {1}"},
		{MessageUtil.ARSCDECODER_SPARSE_TYPE,             "Sparse type flags detected: {0}"},
		{MessageUtil.ARSCDECODER_DEFAULT_PACKAGE,         "Arsc file contains multiple packages. Using package {0} as default."},

		{MessageUtil.COPY_FILE_WITH_METHOD,               "Copying unknown file {0} with method {1}"},
		{MessageUtil.AAPT2_COMPILE_RUN,                   "aapt2 compile command ran: "},
		{MessageUtil.AAPT2_LINK_RUN,                      "aapt2 link command ran: "},
		{MessageUtil.AAPT_COMMAND_RUN,                    "command ran: "},

		{MessageUtil.SEVERE1,                             "WARNING: Could not write to ({0}), using {1} instead..."},
		{MessageUtil.SEVERE2,                             "Please be aware this is a volatile directory and frameworks could go missing, please utilize --frame-path if the default storage directory is unavailable"},
		{MessageUtil.SEVERE3,                             "Can't create Framework directory: {0}"},
		{MessageUtil.COULD_NOT_FIND_SOURCE,               "Could not find sources"},
		{MessageUtil.COULD_NOT_FIND_RESOURCE,             "Could not find resources"},
		{MessageUtil.PATSE_MANIFEST_FAILED,               "Parse AndroidManifest.xml failed, treat it as raw file."},
		{MessageUtil.SKIP_PACKAGE_GROUP,                  "Skipping {0} package group"},
		{MessageUtil.SET_DEFAULT_AAPT,                    "aapt: {0} (defaulting to $PATH binary)"},
		{MessageUtil.EMPTY_FRAME_FAILED,                  "Can't empty framework directory, no file found at: {0}"},
		{MessageUtil.MORE_THAN_ONE_FRAME,                 "More than default framework detected. Please run command with `--force` parameter to wipe framework directory."},
		{MessageUtil.INVALID_ORIENTATION,                 "Invalid orientation value: {0}"},
		{MessageUtil.INVALID_DENSITY,                     "Invalid density value: {0}"},
		{MessageUtil.INVALID_KEYBOARD,                    "Invalid keyboard value: {0}"},
		{MessageUtil.INVALID_NAVIGATION,                  "Invalid navigation value: {0}"},
		{MessageUtil.INVALID_TOUCHSCREEN,                 "Invalid touchscreen value: {0}"},
		{MessageUtil.MULTIPLE_TYPE,                       "Multiple types detected! {0} ignored!"},
		{MessageUtil.REPORT_FIX,                          "Please report this application to Apktool for a fix: https://github.com/iBotPeaches/Apktool/issues/1728"},
		{MessageUtil.DECTED_UNKNOWN_DATA,                 "Unknown data detected. Skipping: {0} byte(s)"},
		{MessageUtil.DECTED_INVALID_DATA,                 "Invalid data detected. Skipping: {0} byte(s)"},
		{MessageUtil.INVALID_CONFIG_DROP,                 "Invalid config flags detected. Dropping resources: {0}"},
		{MessageUtil.INVALID_CONFIG,                      "Invalid config flags detected: {0}"},
		{MessageUtil.DUPLICATE_RESOURCES,                 "Duplicate Resource Detected. Ignoring duplicate: {0}"},
		{MessageUtil.JAXP_1_5_NOT_SUPPORT,                "JAXP 1.5 Support is required to validate XML"},
		{MessageUtil.UNKNOWN_TYPE,                        "Unknown file type, ignoring: {0}"}
	};

	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
