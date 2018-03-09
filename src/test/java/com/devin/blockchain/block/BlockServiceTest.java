package com.devin.blockchain.block;
import com.alibaba.fastjson.JSON;
import com.devin.blockchain.model.Block;
import com.devin.blockchain.model.Transaction;
import com.devin.blockchain.security.CryptoUtil;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
/**
 * 测试区块
 */
public class BlockServiceTest {
    @Test
    public void testBlockMine() throws Exception{
        //创建一个空的区块链
        List<Block> blockchain = new ArrayList<Block>();
        //生成创世区块
        Block block = new Block(1,System.currentTimeMillis(),new ArrayList<Transaction>(),1,"1","1");
        //加入创世区块到区块链里面
        blockchain.add(block);
        //System.out.println("Hello test");
        //创建一个空的交易集合
        List<Transaction> transactions = new ArrayList<Transaction>();
        Transaction tx1 = new Transaction();
        Transaction tx2 = new Transaction();
        Transaction tx3 = new Transaction();
        transactions.add(tx1);
        transactions.add(tx2);
        transactions.add(tx3);
        //创建奖励
        Transaction systx = new Transaction();
        transactions.add(systx);
        //获得当前区块链中最后一个区块
        Block latestBlock = blockchain.get(blockchain.size()-1);
        int nonce = 1;
        String hash = "";
        //挖矿
        while(true){
            hash= CryptoUtil.SHA256(latestBlock.getHash() + JSON.toJSONString(transactions) + nonce);
            if(hash.startsWith("0000")){
                System.out.println("=====计算结果正确，计算次数为：" +nonce+ ",hash:" + hash);
                break;
            }
            nonce++;
            System.out.println("计算错误，hash:" + hash);
        }
        //写入区块链
        Block newBlock = new Block(latestBlock.getIndex() + 1,
                System.currentTimeMillis(), transactions, nonce, latestBlock.getHash(), hash);
        blockchain.add(newBlock);
        System.out.println("挖矿后的区块链：" + JSON.toJSONString(blockchain));
    }

}
