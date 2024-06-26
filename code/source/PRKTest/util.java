package PRKTest;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class util

{
	// ---( internal utility methods )---

	final static util _instance = new util();

	static util _newInstance() { return new util(); }

	static util _cast(Object o) { return (util)o; }

	// ---( server methods )---




	public static final void fetchGV (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(fetchGV)>> ---
		// @sigtype java 3.5
		// [i] field:0:required key
		// [o] field:0:required value
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	key = IDataUtil.getString( pipelineCursor, "key" );
		 
		 
		String value=IDataUtil.getString(pipelineCursor,"$key");
		pipelineCursor.destroy();  
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "value", value );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

