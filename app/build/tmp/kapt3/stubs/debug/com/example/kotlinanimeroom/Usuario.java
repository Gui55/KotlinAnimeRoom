package com.example.kotlinanimeroom;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u00a8\u0006\u0018"}, d2 = {"Lcom/example/kotlinanimeroom/Usuario;", "", "id", "", "userName", "", "senha", "imagem", "Landroid/graphics/Bitmap;", "(ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getId", "()I", "setId", "(I)V", "getImagem", "()Landroid/graphics/Bitmap;", "setImagem", "(Landroid/graphics/Bitmap;)V", "getSenha", "()Ljava/lang/String;", "setSenha", "(Ljava/lang/String;)V", "getUserName", "setUserName", "app_debug"})
public final class Usuario {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String senha;
    @org.jetbrains.annotations.NotNull()
    private android.graphics.Bitmap imagem;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSenha() {
        return null;
    }
    
    public final void setSenha(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getImagem() {
        return null;
    }
    
    public final void setImagem(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap p0) {
    }
    
    public Usuario(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String senha, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap imagem) {
        super();
    }
}