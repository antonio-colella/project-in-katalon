package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object local
     
    /**
     * <p></p>
     */
    public static Object production
     
    /**
     * <p></p>
     */
    public static Object staging1
     
    /**
     * <p></p>
     */
    public static Object staging2
     
    /**
     * <p></p>
     */
    public static Object adminEmail
     
    /**
     * <p></p>
     */
    public static Object adminSenha
     
    /**
     * <p></p>
     */
    public static Object supervisorEmail
     
    /**
     * <p></p>
     */
    public static Object supervisorSenha
     
    /**
     * <p></p>
     */
    public static Object operadorEmail
     
    /**
     * <p></p>
     */
    public static Object operadorSenha
     
    /**
     * <p></p>
     */
    public static Object customEmail
     
    /**
     * <p></p>
     */
    public static Object customSenha
     
    /**
     * <p></p>
     */
    public static Object maxTimeOut
     
    /**
     * <p></p>
     */
    public static Object minTimeout
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            local = selectedVariables['local']
            production = selectedVariables['production']
            staging1 = selectedVariables['staging1']
            staging2 = selectedVariables['staging2']
            adminEmail = selectedVariables['adminEmail']
            adminSenha = selectedVariables['adminSenha']
            supervisorEmail = selectedVariables['supervisorEmail']
            supervisorSenha = selectedVariables['supervisorSenha']
            operadorEmail = selectedVariables['operadorEmail']
            operadorSenha = selectedVariables['operadorSenha']
            customEmail = selectedVariables['customEmail']
            customSenha = selectedVariables['customSenha']
            maxTimeOut = selectedVariables['maxTimeOut']
            minTimeout = selectedVariables['minTimeout']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
