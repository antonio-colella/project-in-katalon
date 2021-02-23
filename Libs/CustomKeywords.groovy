
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


/**
	 * Login controlle
	 * @param user email for login
	 * @param user password for login
	 */
def static "login.User.Login"(
    	String username	
     , 	String password	) {
    (new login.User()).Login(
        	username
         , 	password)
}

/**
	 * Logout controlle
	 */
def static "login.User.Logout"() {
    (new login.User()).Logout()
}
