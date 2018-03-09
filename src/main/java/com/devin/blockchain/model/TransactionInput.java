package com.devin.blockchain.model;

/**
 * 交易输入
 * @author devin
 */
public class TransactionInput {
    /**
     * 前一次交易id
     */
    private String id;
    /**
     * 交易金额
     */
    private int value;
    /**
     * 交易签名
     */
    private String signature;
    /**
     * 交易发送方的钱包公钥
     */
    private String publicKey;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
