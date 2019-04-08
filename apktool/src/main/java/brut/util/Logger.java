package brut.util;
import brut.androlib.AndrolibException;
import java.util.logging.Level;

public interface Logger
{

	public void error(int text, Object... args);


	public void log(Level wARNING, String format, Throwable ex);


	public void fine(int id, Object... args);

	public void warning(int id, Object... args) ;

	public void info(int id, Object... args) ;
}
