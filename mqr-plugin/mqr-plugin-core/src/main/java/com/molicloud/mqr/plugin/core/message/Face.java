package com.molicloud.mqr.plugin.core.message;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 「原生表情」消息
 *
 * @author wispx wisp-x@qq.com
 * @since 2020/11/27 2:52 下午
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Face {
    /**
     * 表情ID
     */
    private int id;

    // 表情ID
    public static final int unknown = 0xff;
    public static final int jingya = 0; // [惊讶]
    public static final int piezui = 1; // [撇嘴]
    public static final int se = 2; // [色]
    public static final int fadai = 3; // [发呆]
    public static final int deyi = 4; // [得意]
    public static final int liulei = 5; // [流泪]
    public static final int haixiu = 6; // [害羞]
    public static final int bizui = 7; // [闭嘴]
    public static final int shui = 8; // [睡]
    public static final int daku = 9; // [大哭]
    public static final int ganga = 10; // [尴尬]
    public static final int fanu = 11; // [发怒]
    public static final int tiaopi = 12; // [调皮]
    public static final int ciya = 13; // [呲牙]
    public static final int weixiao = 14; // [微笑]
    public static final int nanguo = 15; // [难过]
    public static final int ku = 16; // [酷]
    public static final int zhuakuang = 18; // [抓狂]
    public static final int tu = 19; // [吐]
    public static final int touxiao = 20; // [偷笑]
    public static final int keai = 21; // [可爱]
    public static final int baiyan = 22; // [白眼]
    public static final int aoman = 23; // [傲慢]
    public static final int ji_e = 24; // [饥饿]
    public static final int kun = 25; // [困]
    public static final int jingkong = 26; // [惊恐]
    public static final int liuhan = 27; // [流汗]
    public static final int hanxiao = 28; // [憨笑]
    public static final int dabing = 29; // [大病]
    public static final int fendou = 30; // [奋斗]
    public static final int zhouma = 31; // [咒骂]
    public static final int yiwen = 32; // [疑问]
    public static final int yun = 34; // [晕]
    public static final int zhemo = 35; // [折磨]
    public static final int shuai = 36; // [衰]
    public static final int kulou = 37; // [骷髅]
    public static final int qiaoda = 38; // [敲打]
    public static final int zaijian = 39; // [再见]
    public static final int fadou = 41; // [发抖]
    public static final int aiqing = 42; // [爱情]
    public static final int tiaotiao = 43; // [跳跳]
    public static final int zhutou = 46; // [猪头]
    public static final int yongbao = 49; // [拥抱]
    public static final int dan_gao = 53; // [蛋糕]
    public static final int shandian = 54; // [闪电]
    public static final int zhadan = 55; // [炸弹]
    public static final int dao = 56; // [刀]
    public static final int zuqiu = 57; // [足球]
    public static final int bianbian = 59; // [便便]
    public static final int kafei = 60; // [咖啡]
    public static final int fan = 61; // [饭]
    public static final int meigui = 63; // [玫瑰]
    public static final int diaoxie = 64; // [凋谢]
    public static final int aixin = 66; // [爱心]
    public static final int xinsui = 67; // [心碎]
    public static final int liwu = 69; // [礼物]
    public static final int taiyang = 74; // [太阳]
    public static final int yueliang = 75; // [月亮]
    public static final int qiang = 76; // [强]
    public static final int ruo = 77; // [弱]
    public static final int woshou = 78; // [握手]
    public static final int shengli = 79; // [胜利]
    public static final int feiwen = 85; // [飞吻]
    public static final int naohuo = 86; // [恼火]
    public static final int xigua = 89; // [西瓜]
    public static final int lenghan = 96; // [冷汗]
    public static final int cahan = 97; // [擦汗]
    public static final int koubi = 98; // [抠鼻]
    public static final int guzhang = 99; // [鼓掌]
    public static final int qiudale = 100; // [糗大了]
    public static final int huaixiao = 101; // [坏笑]
    public static final int zuohengheng = 102; // [左哼哼]
    public static final int youhengheng = 103; // [右哼哼]
    public static final int haqian = 104; // [哈欠]
    public static final int bishi = 105; // [鄙视]
    public static final int weiqu = 106; // [委屈]
    public static final int kuaikule = 107; // [快哭了]
    public static final int yinxian = 108; // [阴险]
    public static final int qinqin = 109; // [亲亲]
    public static final int xia = 110; // [吓]
    public static final int kelian = 111; // [可怜]
    public static final int caidao = 112; // [菜刀]
    public static final int pijiu = 113; // [啤酒]
    public static final int lanqiu = 114; // [篮球]
    public static final int pingpang = 115; // [乒乓]
    public static final int shiai = 116; // [示爱]
    public static final int piaochong = 117; // [瓢虫]
    public static final int baoquan = 118; // [抱拳]
    public static final int gouyin = 119; // [勾引]
    public static final int quantou = 120; // [拳头]
    public static final int chajin = 121; // [差劲]
    public static final int aini = 122; // [爱你]
    public static final int bu = 123; // [NO]
    public static final int hao = 124; // [OK]
    public static final int zhuanquan = 125; // [转圈]
    public static final int ketou = 126; // [磕头]
    public static final int huitou = 127; // [回头]
    public static final int tiaosheng = 128; // [跳绳]
    public static final int huishou = 129; // [挥手]
    public static final int jidong = 130; // [激动]
    public static final int jiewu = 131; // [街舞]
    public static final int xianwen = 132; // [献吻]
    public static final int zuotaiji = 133; // [左太极]
    public static final int youtaiji = 134; // [右太极]
    public static final int shuangxi = 136; // [双喜]
    public static final int bianpao = 137; // [鞭炮]
    public static final int denglong = 138; // [灯笼]
    public static final int facai = 139; // [发财]
    public static final int K_ge = 140; // [K歌]
    public static final int gouwu = 141; // [购物]
    public static final int youjian = 142; // [邮件]
    public static final int shuai_qi = 143; // [帅气]
    public static final int hecai = 144; // [喝彩]
    public static final int qidao = 145; // [祈祷]
    public static final int baojin = 146; // [爆筋]
    public static final int bangbangtang = 147; // [棒棒糖]
    public static final int he_nai = 148; // [喝奶]
    public static final int xiamian = 149; // [下面]
    public static final int xiangjiao = 150; // [香蕉]
    public static final int feiji = 151; // [飞机]
    public static final int kaiche = 152; // [开车]
    public static final int gaotiezuochetou = 153; // [高铁左车头]
    public static final int chexiang = 154; // [车厢]
    public static final int gaotieyouchetou = 155; // [高铁右车头]
    public static final int duoyun = 156; // [多云]
    public static final int xiayu = 157; // [下雨]
    public static final int chaopiao = 158; // [钞票]
    public static final int xiongmao = 159; // [熊猫]
    public static final int dengpao = 160; // [灯泡]
    public static final int fengche = 161; // [风车]
    public static final int naozhong = 162; // [闹钟]
    public static final int dasan = 163; // [打伞]
    public static final int caiqiu = 164; // [彩球]
    public static final int zuanjie = 165; // [钻戒]
    public static final int shafa = 166; // [沙发]
    public static final int zhijin = 167; // [纸巾]
    public static final int yao = 168; // [药]
    public static final int shouqiang = 169; // [手枪]
    public static final int qingwa = 170; // [青蛙]
    public static final int hexie = 184; // [河蟹]
    public static final int yangtuo = 185; // [羊驼]
    public static final int youling = 187; // [幽灵]
    public static final int dan = 188; // [蛋]
    public static final int juhua = 190; // [菊花]
    public static final int hongbao = 192; // [红包]
    public static final int daxiao = 193; // [大笑]
    public static final int bukaixin = 194; // [不开心]
    public static final int lengmo = 197; // [冷漠]
    public static final int e = 198; // [呃]
    public static final int haobang = 199; // [好棒]
    public static final int baituo = 200; // [拜托]
    public static final int dianzan = 201; // [点赞]
    public static final int wuliao = 202; // [无聊]
    public static final int tuolian = 203; // [托脸]
    public static final int chi = 204; // [吃]
    public static final int songhua = 205; // [送花]
    public static final int haipa = 206; // [害怕]
    public static final int huachi = 207; // [花痴]
    public static final int xiaoyanger = 208; // [小样儿]
    public static final int biaolei = 210; // [飙泪]
    public static final int wobukan = 211; // [我不看]
    public static final int bobo = 214; // [啵啵]
    public static final int hulian = 215; // [糊脸]
    public static final int paitou = 216; // [拍头]
    public static final int cheyiche = 217; // [扯一扯]
    public static final int tianyitian = 218; // [舔一舔]
    public static final int cengyiceng = 219; // [蹭一蹭]
    public static final int zhuaizhatian = 220; // [拽炸天]
    public static final int dingguagua = 221; // [顶呱呱]
    public static final int baobao = 222; // [抱抱]
    public static final int baoji = 223; // [暴击]
    public static final int kaiqiang = 224; // [开枪]
    public static final int liaoyiliao = 225; // [撩一撩]
    public static final int paizhuo = 226; // [拍桌]
    public static final int paishou = 227; // [拍手]
    public static final int gongxi = 228; // [恭喜]
    public static final int ganbei = 229; // [干杯]
    public static final int chaofeng = 230; // [嘲讽]
    public static final int heng = 231; // [哼]
    public static final int foxi = 232; // [佛系]
    public static final int qiaoyiqioa = 233; // [敲一敲]
    public static final int jingdai = 234; // [惊呆]
    public static final int chandou = 235; // [颤抖]
    public static final int kentou = 236; // [啃头]
    public static final int toukan = 237; // [偷看]
    public static final int shanlian = 238; // [扇脸]
    public static final int yuanliang = 239; // [原谅]
    public static final int penlian = 240; // [喷脸]
    public static final int shengrikuaile = 241; // [生日快乐]
    public static final int touzhuangji = 242; // [头撞击]
    public static final int shuaitou = 243; // [甩头]
    public static final int rengou = 244; // [扔狗]
    public static final int bishengjiayou = 245; // [必胜加油]
    public static final int jiayoubaobao = 246; // [加油抱抱]
    public static final int kouzhaohuti = 247; // [口罩护体]
}