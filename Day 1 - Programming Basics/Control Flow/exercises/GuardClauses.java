/**
 * Exercise 8: Guard Clauses
 * 
 * This exercise focuses on using guard clauses and early returns to write cleaner,
 * more maintainable code by reducing nesting and improving readability.
 * 
 * Learning objectives:
 * - Understand the concept of guard clauses
 * - Learn to use early returns to reduce nesting
 * - Practice refactoring code to improve readability
 * 
 * Note: This exercise uses assertions. Run with the -ea flag:
 * java -ea GuardClauses
 */
public class GuardClauses {
    
    public static void main(String[] args) {
        System.out.println("Exercise 8: Guard Clauses");
        
        try {
            // Test the refactored input validator
            testValidateUserInput();
            
            // Test the refactored disk space checker
            testCheckDiskSpace();
            
            // Test the refactored password strength checker
            testCheckPasswordStrength();
            
            System.out.println("All tests passed! Your implementation is correct.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
    
    /**
     * Tests the input validator implementation.
     */
    private static void testValidateUserInput() {
        // Valid inputs
        assert validateUserInput("username", "password123", true).equals("Input is valid") :
               "Valid input should return 'Input is valid'";
        
        // Invalid username
        assert validateUserInput("", "password123", true).equals("Username cannot be empty") :
               "Empty username should return error message";
        assert validateUserInput(null, "password123", true).equals("Username cannot be null") :
               "Null username should return error message";
        
        // Invalid password
        assert validateUserInput("username", "", true).equals("Password cannot be empty") :
               "Empty password should return error message";
        assert validateUserInput("username", null, true).equals("Password cannot be null") :
               "Null password should return error message";
        assert validateUserInput("username", "pass", true).equals("Password must be at least 8 characters") :
               "Short password should return error message";
        
        // Terms not accepted
        assert validateUserInput("username", "password123", false).equals("Terms must be accepted") :
               "Unaccepted terms should return error message";
    }
    
    /**
     * Tests the disk space checker implementation.
     */
    private static void testCheckDiskSpace() {
        // Sufficient disk space
        assert checkDiskSpace(1000, 900, false).equals("Sufficient disk space") :
               "900 MB used of 1000 MB should be sufficient";
        
        // Insufficient disk space
        assert checkDiskSpace(1000, 950, false).equals("Disk space low") :
               "950 MB used of 1000 MB should be low";
        
        // Critical disk space
        assert checkDiskSpace(1000, 980, false).equals("Disk space critical") :
               "980 MB used of 1000 MB should be critical";
        
        // Disk full
        assert checkDiskSpace(1000, 1000, false).equals("Disk full") :
               "1000 MB used of 1000 MB should be full";
        
        // Error cases
        assert checkDiskSpace(0, 0, false).equals("Invalid disk size") :
               "Zero disk size should be invalid";
        assert checkDiskSpace(-100, 0, false).equals("Invalid disk size") :
               "Negative disk size should be invalid";
        assert checkDiskSpace(1000, -100, false).equals("Invalid used space") :
               "Negative used space should be invalid";
        assert checkDiskSpace(1000, 1100, false).equals("Used space exceeds disk size") :
               "Used space exceeding disk size should return error";
        
        // System disk different thresholds
        assert checkDiskSpace(1000, 800, true).equals("Disk space low") :
               "800 MB used of 1000 MB should be low for system disk";
        assert checkDiskSpace(1000, 900, true).equals("Disk space critical") :
               "900 MB used of 1000 MB should be critical for system disk";
    }
    
    /**
     * Tests the password strength checker implementation.
     */
    private static void testCheckPasswordStrength() {
        // Invalid cases
        assert checkPasswordStrength(null).equals("Invalid password") :
               "Null password should be invalid";
        assert checkPasswordStrength("").equals("Invalid password") :
               "Empty password should be invalid";
        
        // Very weak password
        assert checkPasswordStrength("abc").equals("Very weak") :
               "Short password should be very weak";
        
        // Weak password
        assert checkPasswordStrength("abcdefgh").equals("Weak") :
               "Password with only lowercase should be weak";
        
        // Medium password
        assert checkPasswordStrength("Abcdefgh").equals("Medium") :
               "Password with lowercase and uppercase should be medium";
        
        // Strong password
        assert checkPasswordStrength("Abcdef1").equals("Strong") :
               "Password with lowercase, uppercase, and numbers should be strong";
        
        // Very strong password
        assert checkPasswordStrength("Abcdef1!").equals("Very strong") :
               "Password with lowercase, uppercase, numbers, and symbols should be very strong";
    }
    
    /**
     * Validates user input with guard clauses.
     * 
     * TODO: Refactor this method to use guard clauses and early returns instead of nested if-else statements.
     * The method should validate the username, password, and terms acceptance.
     * 
     * The validation rules are:
     * - Username cannot be null or empty
     * - Password cannot be null or empty
     * - Password must be at least 8 characters
     * - Terms must be accepted
     * 
     * @param username The username to validate
     * @param password The password to validate
     * @param termsAccepted Whether the terms are accepted
     * @return A string indicating the validation result
     */
    public static String validateUserInput(String username, String password, boolean termsAccepted) {
        // This is the nested version - refactor it to use guard clauses
        if (username != null) {
            if (!username.isEmpty()) {
                if (password != null) {
                    if (!password.isEmpty()) {
                        if (password.length() >= 8) {
                            if (termsAccepted) {
                                return "Input is valid";
                            } else {
                                return "Terms must be accepted";
                            }
                        } else {
                            return "Password must be at least 8 characters";
                        }
                    } else {
                        return "Password cannot be empty";
                    }
                } else {
                    return "Password cannot be null";
                }
            } else {
                return "Username cannot be empty";
            }
        } else {
            return "Username cannot be null";
        }
    }
    
    /**
     * Checks disk space with guard clauses.
     * 
     * TODO: Refactor this method to use guard clauses and early returns instead of nested if-else statements.
     * The method should check if there's sufficient disk space.
     * 
     * The rules are:
     * - Disk size must be positive
     * - Used space must be non-negative
     * - Used space cannot exceed disk size
     * 
     * For non-system disks:
     * - If used space is >= 98% of disk size, it's "Disk full"
     * - If used space is >= 95% of disk size, it's "Disk space critical"
     * - If used space is >= 90% of disk size, it's "Disk space low"
     * - Otherwise, it's "Sufficient disk space"
     * 
     * For system disks (isSystemDisk = true), use more conservative thresholds:
     * - If used space is >= 90% of disk size, it's "Disk space critical"
     * - If used space is >= 80% of disk size, it's "Disk space low"
     * 
     * @param diskSize The total disk size in MB
     * @param usedSpace The used space in MB
     * @param isSystemDisk Whether this is a system disk
     * @return A string indicating the disk space status
     */
    public static String checkDiskSpace(int diskSize, int usedSpace, boolean isSystemDisk) {
        // This is the nested version - refactor it to use guard clauses
        if (diskSize > 0) {
            if (usedSpace >= 0) {
                if (usedSpace <= diskSize) {
                    double usagePercentage = (double) usedSpace / diskSize * 100;
                    
                    if (isSystemDisk) {
                        if (usagePercentage >= 98) {
                            return "Disk full";
                        } else if (usagePercentage >= 90) {
                            return "Disk space critical";
                        } else if (usagePercentage >= 80) {
                            return "Disk space low";
                        } else {
                            return "Sufficient disk space";
                        }
                    } else {
                        if (usagePercentage >= 98) {
                            return "Disk full";
                        } else if (usagePercentage >= 95) {
                            return "Disk space critical";
                        } else if (usagePercentage >= 90) {
                            return "Disk space low";
                        } else {
                            return "Sufficient disk space";
                        }
                    }
                } else {
                    return "Used space exceeds disk size";
                }
            } else {
                return "Invalid used space";
            }
        } else {
            return "Invalid disk size";
        }
    }
    
    /**
     * Checks password strength using guard clauses.
     * 
     * TODO: Implement this method using guard clauses to check password strength:
     * - If password is null or empty, return "Invalid password"
     * - If password is less than 6 characters, return "Very weak"
     * - If password has only lowercase letters, return "Weak"
     * - If password has lowercase and uppercase letters, return "Medium"
     * - If password has lowercase, uppercase, and numbers, return "Strong"
     * - If password has lowercase, uppercase, numbers, and symbols, return "Very strong"
     * 
     * Hints:
     * - Use regular expressions or character checks to verify password contents
     * - Check simpler conditions first for early returns
     * - Use methods like Character.isUpperCase(), Character.isLowerCase(), etc.
     * 
     * @param password The password to check
     * @return A string indicating the password strength
     */
    public static String checkPasswordStrength(String password) {
        // TODO: Implement your solution here using guard clauses
        return null; // Replace with your implementation
    }
    
    // Helper methods for character type checking (Feel free to use these)
    private static boolean containsLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean containsUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean containsDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean containsSymbol(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
    }
} 