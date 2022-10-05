# homework-jee-experiment-jsp
 Simple register and login application based on JSP.

## Background

Mister Pan's JEE course, in Zhejiang Normal University.

He want us to make a web application with only JSP, but no physical database.

The application should realize the function of register and login.

Reference: [Oracle register](https://profile.oracle.com/myprofile/account/create-account.jspx)

## My Draft

### Password Encryption:

Hash ***N*** times until there is no collision. (In order to make sure that there aren't two same series of hash code)

Record the **final hash code** and **how many times** the password was hashed , with the `Map` collection, into implicit object `Application context`.

### Before Register and Login:

Get and Send information through `Request request`.

### After Login Successfully:

Record the "already login" signal into `Session session`.

### After Clicking "Logout":

Remove the "already login" signal from `Session session`.

