package crypto;

import java.nio.charset.StandardCharsets;

import com.goterl.lazycode.lazysodium.LazySodiumJava;
import com.goterl.lazycode.lazysodium.SodiumJava;
import com.goterl.lazycode.lazysodium.interfaces.PwHash;

/**
 * Class which uses the argon2 hash function to hash the users
 * PW for either storage or checking for the correct password
 * on user login.
 * 
 * @author Ryan Hansen
 */
public class PWHashing {
	
	private SodiumJava mySodium;
	private LazySodiumJava myLazySodium;
	private String myHashedPW;
	
	/**
	 * Uses the Argon2 hash function to hash a password.
	 * 
	 * @param thePW password passed in to be hashed
	 * @return String of the hashed password
	 */
	public String hashThePW(String thePW){
		mySodium = new SodiumJava();
		myLazySodium = new LazySodiumJava(mySodium);
		PwHash.Native pwHash = (PwHash.Native) myLazySodium;
		
		byte[] pw = thePW.getBytes(StandardCharsets.US_ASCII);
		byte[] outputHash = new byte[PwHash.STR_BYTES];
		
		//Makes a call to the sodium library and hashes the user
		//supplied (auto-salted) password into the Argon2 hash function. 
		//Operations and memory limit are both set to the default moderate
		//for increased security against rainbow/dictionary attacks.
		boolean success = pwHash.cryptoPwHashStr(
			outputHash,
		    pw,
		    pw.length,
		    PwHash.ARGON2ID_OPSLIMIT_MODERATE,
		    PwHash.ARGON2ID_MEMLIMIT_MODERATE
		);
		
		//converts the hashed byte array to a string to return to caller.
		myHashedPW = new String(outputHash, StandardCharsets.US_ASCII);
		return myHashedPW;
		
	}

}
