# AWS-Encryption
version 0.2

Project to learn/use a variety of AWS features as well as some built-in Java encryption libraries.  

Overview:  
Program to allow users to securely login (Argon2 hashed password storage), encrypt files of their choosing (AES encryption), store encrypted files in the Amazon Web Services cloud system, retrieve stored files for decryption, and (insert more functionality here when we complete the rest).

Login functionality:  
Uses the modern encryption library [LibSodium](https://download.libsodium.org/doc/ "Libsodium Homepage"), which is a forked project from the [NaCl](http://nacl.cr.yp.to/ "Salt Homepage") networking and cryptographic library, to put user passwords into the Argon2 hash function for safe storage in a AWS online database.  

Phase 1:    
-Establish basic GUI. (complete)  
-Add user login. (complete)  
-Hash user passwords with LibSodium library (argon2 hash function). (complete)  
-Use AWS relational database for storing user account information. (WIP)  

Phase 2:  
-Enable encryption/decryption of .txt files locally with AES encryption.  
-Use AWS Lambda service for encryption/decryption methods.  
-USE AWS S3 cloud storage for encrypted files.  
