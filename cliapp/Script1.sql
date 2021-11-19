--<ScriptOptions statementTerminator=";"/>
CREATE TABLE users(id INTEGER PRIMARY KEY, login TEXT NOT NULL, password_hash TEXT NOT NULL, salt TEXT NOT NULL)
