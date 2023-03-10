/**
 * 
 */
package org.topicquests.asr.dictionary.server.api;
import java.util.*;

import net.minidev.json.JSONObject;

/**
 * @author jackpark
 *
 */
public interface IPostgresDictionary {

	long addTermWord(String word);
	
	/**
	 * Can return <code>null</code>
	 * @param id
	 * @return
	 */
	String getTermById(long id);
	
	/**
	 * Returns <code>-1</code>if not found
	 * @param word
	 * @return
	 */
	long getTermId(String word);
	
	JSONObject getDictionary();

	
	boolean isEmpty();
	List<String> listWords(int offset, int count);

	void shutDown();

}
