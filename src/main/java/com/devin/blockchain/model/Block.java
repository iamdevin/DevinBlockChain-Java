package com.devin.blockchain.model;

import java.util.List;

/**
 * @author devin
 */
public class Block {
    /**
     * 区块索引号
     */
    private int index;
    /**
     * 当前区块的hash值,区块唯一标识
     */
    private String hash;
    /**
     * 生成区块的时间戳
     */
    private long timestamp;
    /**
     * 当前区块的交易集合
     */
    private List<Transaction> transations;
    /**
     * 工作量证明，计算正确的hash值得次数
     */
    private int nonce;
    /**
     * 前一个区块的hash值
     */
    private String previousHash;

    public Block() {
        super();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public List<Transaction> getTransations() {
        return transations;
    }

    public void setTransations(List<Transaction> transations) {
        this.transations = transations;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }
}
