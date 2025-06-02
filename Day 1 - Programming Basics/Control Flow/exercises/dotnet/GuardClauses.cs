namespace ControlFlow.Exercises;

/// <summary>
/// Exercise 7: Guard Clauses
/// 
/// This exercise focuses on using guard clauses and early returns to write cleaner,
/// more maintainable code by reducing nesting and improving readability.
/// 
/// Learning objectives:
/// - Understand the concept of guard clauses
/// - Learn to use early returns to reduce nesting
/// - Practice refactoring code to improve readability
/// </summary>
public class GuardClauses
{
    /// <summary>
    /// Validates user input with guard clauses.
    /// 
    /// TODO: Refactor this method to use guard clauses and early returns instead of nested if-else statements.
    /// The method should validate the username, password, and terms acceptance.
    /// 
    /// The validation rules are:
    /// - Username cannot be null or empty
    /// - Password cannot be null or empty
    /// - Password must be at least 8 characters
    /// - Terms must be accepted
    /// </summary>
    /// <param name="username">The username to validate</param>
    /// <param name="password">The password to validate</param>
    /// <param name="termsAccepted">Whether the terms are accepted</param>
    /// <returns>A string indicating the validation result</returns>
    public static string ValidateUserInput(string username, string password, bool termsAccepted)
    {
        // This is the nested version - refactor it to use guard clauses
        if (username != null)
        {
            if (!string.IsNullOrEmpty(username))
            {
                if (password != null)
                {
                    if (!string.IsNullOrEmpty(password))
                    {
                        if (password.Length >= 8)
                        {
                            if (termsAccepted)
                            {
                                return "Input is valid";
                            }
                            else
                            {
                                return "Terms must be accepted";
                            }
                        }
                        else
                        {
                            return "Password must be at least 8 characters";
                        }
                    }
                    else
                    {
                        return "Password cannot be empty";
                    }
                }
                else
                {
                    return "Password cannot be null";
                }
            }
            else
            {
                return "Username cannot be empty";
            }
        }
        else
        {
            return "Username cannot be null";
        }
    }
    
    /// <summary>
    /// Checks disk space with guard clauses.
    /// 
    /// TODO: Refactor this method to use guard clauses and early returns instead of nested if-else statements.
    /// The method should check if there's sufficient disk space.
    /// 
    /// The rules are:
    /// - Disk size must be positive
    /// - Used space must be non-negative
    /// - Used space cannot exceed disk size
    /// 
    /// For non-system disks:
    /// - If used space is >= 98% of disk size, it's "Disk full"
    /// - If used space is >= 95% of disk size, it's "Disk space critical"
    /// - If used space is >= 90% of disk size, it's "Disk space low"
    /// - Otherwise, it's "Sufficient disk space"
    /// 
    /// For system disks (isSystemDisk = true), use more conservative thresholds:
    /// - If used space is >= 90% of disk size, it's "Disk space critical"
    /// - If used space is >= 80% of disk size, it's "Disk space low"
    /// </summary>
    /// <param name="diskSize">The total disk size in MB</param>
    /// <param name="usedSpace">The used space in MB</param>
    /// <param name="isSystemDisk">Whether this is a system disk</param>
    /// <returns>A string indicating the disk space status</returns>
    public static string CheckDiskSpace(int diskSize, int usedSpace, bool isSystemDisk)
    {
        // This is the nested version - refactor it to use guard clauses
        if (diskSize > 0)
        {
            if (usedSpace >= 0)
            {
                if (usedSpace <= diskSize)
                {
                    double usagePercentage = (double)usedSpace / diskSize * 100;
                    
                    if (isSystemDisk)
                    {
                        if (usagePercentage >= 98)
                        {
                            return "Disk full";
                        }
                        else if (usagePercentage >= 90)
                        {
                            return "Disk space critical";
                        }
                        else if (usagePercentage >= 80)
                        {
                            return "Disk space low";
                        }
                        else
                        {
                            return "Sufficient disk space";
                        }
                    }
                    else
                    {
                        if (usagePercentage >= 98)
                        {
                            return "Disk full";
                        }
                        else if (usagePercentage >= 95)
                        {
                            return "Disk space critical";
                        }
                        else if (usagePercentage >= 90)
                        {
                            return "Disk space low";
                        }
                        else
                        {
                            return "Sufficient disk space";
                        }
                    }
                }
                else
                {
                    return "Used space exceeds disk size";
                }
            }
            else
            {
                return "Invalid used space";
            }
        }
        else
        {
            return "Invalid disk size";
        }
    }
    
    /// <summary>
    /// Checks password strength using guard clauses.
    /// 
    /// TODO: Implement this method using guard clauses to check password strength:
    /// - If password is null or empty, return "Invalid password"
    /// - If password is less than 6 characters, return "Very weak"
    /// - If password has only lowercase letters, return "Weak"
    /// - If password has lowercase and uppercase letters, return "Medium"
    /// - If password has lowercase, uppercase, and numbers, return "Strong"
    /// - If password has lowercase, uppercase, numbers, and symbols, return "Very strong"
    /// </summary>
    /// <param name="password">The password to check</param>
    /// <returns>A string indicating the password strength</returns>
    public static string CheckPasswordStrength(string password)
    {
        // TODO: Implement your solution here using guard clauses
        return string.Empty; // Replace with your implementation
    }
    
    // Helper methods for character type checking
    private static bool ContainsLowerCase(string str)
    {
        foreach (char ch in str)
        {
            if (char.IsLower(ch))
            {
                return true;
            }
        }
        return false;
    }
    
    private static bool ContainsUpperCase(string str)
    {
        foreach (char ch in str)
        {
            if (char.IsUpper(ch))
            {
                return true;
            }
        }
        return false;
    }
    
    private static bool ContainsDigit(string str)
    {
        foreach (char ch in str)
        {
            if (char.IsDigit(ch))
            {
                return true;
            }
        }
        return false;
    }
    
    private static bool ContainsSymbol(string str)
    {
        foreach (char ch in str)
        {
            if (!char.IsLetterOrDigit(ch))
            {
                return true;
            }
        }
        return false;
    }
} 