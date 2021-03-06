package com.buka.tools;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;

import com.buka.R;
import com.buka.db.DBHelper;
import com.buka.db.DBUtil;
import com.buka.entity.CateEntity;
import com.buka.entity.ComicEntity;

public class Constants {
	//
	public final static String IMG_URL =  "img_url";
	/** 　漫画ID */
	public final static String MID =  "mid";
	/** 　漫画NAME */
	public final static String MNAME = "mname";
	/** 　章节ID */
	public final static String CID = "cid";
	/** 　章节NAME */
	public final static String CNAME = "cname";
	/** 　章节号 */
	public final static String CHAPTER = "chapter";
	/** 　是否是推荐的 */
	public final static String ISRECOM = "isrecom";
	/** 　是否是热门的 */
	public final static String ISHOT = "ishot";
	/** 　漫画封面对应的URL */
	public final static String COVER_URL = "cover_url";
	/** 　最后更新时间 */
	public final static String LASTUPTIME = "lastuptime";
	/** 　大分类 */
	public final static String CATE = "cate";
	/** 　作者*/
	public final static String AUTHOR = "author";
	/** 　描述*/
	public final static String DESCRIBE = "describe";
	/** 　战斗力 */
	public final static String FIGHTING = "fighting";
	/** 　评分 */
	public final static String SCORE = "score";
	/** 　吐槽数量 */
	public final static String COMMENTS = "comments";
	/** 　阅读时间 */
	public final static String READTIME = "readtime";
	/** 　封面宽度 */
	public final static String COVER_WIDTH = "cover_width";
	/** 　封面高度 */
	public final static String COVER_HEIGHT = "cover_height";
	
//	public static ArrayList<CateEntity> getCateList() {
//		ArrayList<CateEntity> list = new ArrayList<CateEntity>();
//		for (int i = 0; i < IMAGES_CATE.length; i++) {
//			CateEntity cate1 = new CateEntity("" + i, "title" + i,
//					IMAGES_CATE[i]);
//			list.add(cate1);
//		}
//		return list;
//	}

	public static final String[] IMAGES_CATE = new String[] {
		"http://t1.baidu.com/it/u=1038806409,3412540273&fm=21&gp=0.jpg",
		"http://t10.baidu.com/it/u=50697511,3492324182&fm=21&gp=0.jpg",
		"http://t11.baidu.com/it/u=4261091401,2809499977&fm=23&gp=0.jpg",
		"http://t2.baidu.com/it/u=664664776,2474321331&fm=21&gp=0.jpg",
		"http://t2.baidu.com/it/u=2000984254,671030445&fm=21&gp=0.jpg",
		"http://t12.baidu.com/it/u=1000694325,536197580&fm=21&gp=0.jpg",
		"http://t3.baidu.com/it/u=2877325771,2951626559&fm=21&gp=0.jpg",
		"http://t2.baidu.com/it/u=4217487879,1939311980&fm=21&gp=0.jpg",
		"http://t11.baidu.com/it/u=2154075125,3961488333&fm=21&gp=0.jpg",
		"http://t11.baidu.com/it/u=111124280,2109575648&fm=21&gp=0.jpg",
		"http://t11.baidu.com/it/u=1256943453,3366981119&fm=23&gp=0.jpg", };

	public static final String[] IMAGES_FAVOR_COLLECT = new String[] {
			"http://t1.baidu.com/it/u=3061284966,2756044882&fm=23&gp=0.jpg",
			"http://t11.baidu.com/it/u=2529983486,908137604&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=1020979772,2957475360&fm=23&gp=0.jpg",
			"http://t3.baidu.com/it/u=2877325771,2951626559&fm=21&gp=0.jpg", };

	public static final String[] IMAGES_GMAES = new String[] {
			"http://t11.baidu.com/it/u=1410688958,805123670&fm=21&gp=0.jpg",
			"http://t1.baidu.com/it/u=3897931814,1522652390&fm=21&gp=0.jpg",
			"http://t2.baidu.com/it/u=1066045235,28773116&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=1527621574,1386912874&fm=21&gp=0.jpg",
			"http://t12.baidu.com/it/u=4108516294,20943769&fm=21&gp=0.jpg",
			"http://t11.baidu.com/it/u=909903209,1273275995&fm=23&gp=0.jpg",
			"http://t12.baidu.com/it/u=2076266906,3599676673&fm=21&gp=0.jpg",
			"http://t10.baidu.com/it/u=2628977232,328386117&fm=21&gp=0.jpg",
			"http://t11.baidu.com/it/u=820790964,2591398750&fm=23&gp=0.jpg",
			"http://t12.baidu.com/it/u=3280180812,835806125&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=364059102,2354271842&fm=21&gp=0.jpg", };

	public static final String[] IMAGES_COMIC_RECOM = new String[] {
			"http://t1.baidu.com/it/u=3061284966,2756044882&fm=23&gp=0.jpg",
			"http://t11.baidu.com/it/u=2529983486,908137604&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=1020979772,2957475360&fm=23&gp=0.jpg",
			"http://t3.baidu.com/it/u=2877325771,2951626559&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=1438541608,1664349988&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=2312643488,1310344650&fm=21&gp=0.jpg",
			"http://t2.baidu.com/it/u=2026830143,4256099538&fm=21&gp=0.jpg",
			"http://t11.baidu.com/it/u=3935718187,323290161&fm=21&gp=0.jpg",
			"http://t2.baidu.com/it/u=2182209917,1906729370&fm=21&gp=0.jpg",
			"http://t12.baidu.com/it/u=483576160,3999393869&fm=21&gp=0.jpg",
			"http://t12.baidu.com/it/u=3611301977,2754521368&fm=21&gp=0.jpg",
			"http://t03.pic.sogou.com/f2b417600d437869.jpg",
			"http://t04.pic.sogou.com/da8d7ab1e290f703_i.jpg",
			"http://t02.pic.sogou.com/ca93c31ce69e07eb.jpg",
			"http://t01.pic.sogou.com/4fb986cf8e7c0ec2_i.jpg",
			"http://t01.pic.sogou.com/5e85e74479fbae50.jpg",
			"http://t02.pic.sogou.com/ba4cbc51115b08cb.jpg",
			"http://t02.pic.sogou.com/8aab5b584f318208.jpg",
			"http://t01.pic.sogou.com/115743884f318208.jpg",
			"http://t01.pic.sogou.com/7eef0d06af4c1e0f.jpg",
			"http://t02.pic.sogou.com/9c051458b956b32e.jpg",
			"http://t01.pic.sogou.com/0011c50c6cfcbf99.jpg", };

	public static final String[] IMAGES_COMIC_HOT = new String[] {
			"http://t1.baidu.com/it/u=3061284966,2756044882&fm=23&gp=0.jpg",
			"http://t11.baidu.com/it/u=2529983486,908137604&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=1020979772,2957475360&fm=23&gp=0.jpg",
			"http://t3.baidu.com/it/u=2877325771,2951626559&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=1438541608,1664349988&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=2312643488,1310344650&fm=21&gp=0.jpg",
			"http://t2.baidu.com/it/u=2026830143,4256099538&fm=21&gp=0.jpg",
			"http://t11.baidu.com/it/u=3935718187,323290161&fm=21&gp=0.jpg",
			"http://t2.baidu.com/it/u=2182209917,1906729370&fm=21&gp=0.jpg",
			"http://t12.baidu.com/it/u=483576160,3999393869&fm=21&gp=0.jpg",
			"http://t12.baidu.com/it/u=3611301977,2754521368&fm=21&gp=0.jpg", };

	public static final String[] IMAGES_COMIC_RECENT = new String[] {
			"http://t3.baidu.com/it/u=1048104466,2493564388&fm=21&gp=0.jpg",
			"http://t2.baidu.com/it/u=2549443479,1758375374&fm=21&gp=0.jpg",
			"http://t2.baidu.com/it/u=2035817387,3926361030&fm=23&gp=0.jpg",
			"http://t11.baidu.com/it/u=1738852142,1017800594&fm=21&gp=0.jpg",
			"http://t11.baidu.com/it/u=319901011,3297325185&fm=21&gp=0.jpg",
			"http://t12.baidu.com/it/u=1840711789,1127078560&fm=21&gp=0.jpg",
			"http://t10.baidu.com/it/u=4272609278,2213073209&fm=21&gp=0.jpg",
			"http://t2.baidu.com/it/u=877004527,3626265052&fm=21&gp=0.jpg",
			"http://t1.baidu.com/it/u=1854784735,782630483&fm=21&gp=0.jpg",
			"http://t3.baidu.com/it/u=2739122093,3833003905&fm=21&gp=0.jpg",
			"http://mh.emland.net/photo/14858/98801279338973.jpg", };
	
	public static final int[] COMIC_LOADING_IMG = { R.drawable.l1001,
		R.drawable.l1002, R.drawable.l1003, R.drawable.l1004,
		R.drawable.l1005, R.drawable.l1006, R.drawable.l1007,
		R.drawable.l1008, R.drawable.l1009, R.drawable.l1010,
		R.drawable.l1011, R.drawable.l1012, R.drawable.l1013,
		R.drawable.l1014, R.drawable.l1015, R.drawable.l1016,
		R.drawable.l1017, R.drawable.l1018, R.drawable.l1019,
		R.drawable.l1020, R.drawable.l1021, R.drawable.l1022,
		R.drawable.l1023, R.drawable.l1024, R.drawable.l1025,
		R.drawable.l1026, R.drawable.l1027, };
	
	/** 收藏对应的typeId */
	public final static int FAVOR_COLLECT = 0;
	/** 历史对应的typeId */
	public final static int FAVOR_HISTORY = 1;
	/** 热门推荐对应的typeId */
	public final static int RECOM_HOT = 0;
	/** 游戏中心对应的typeId */
	public final static int RECOM_GAME = 1;
	
	/**
	 * 获取精彩推荐
	 */
	public static ArrayList<ComicEntity> getRecom(Context context){
		ArrayList<ComicEntity> comicList = new ArrayList<ComicEntity>();
		Cursor cursor = null;
		cursor = DBUtil.getInstance(context, DBHelper.TABLE_COMIC).selectData(null, null, null, null, null, null);
		int i = 0;
		while(cursor.moveToNext()){
			ComicEntity comic = new ComicEntity();
			comic.setMid(cursor.getInt(cursor.getColumnIndex(Constants.MID)));
			comic.setMname(cursor.getString(cursor.getColumnIndex(Constants.MNAME)));
			comic.setCid(cursor.getInt(cursor.getColumnIndex(Constants.CID)));
			comic.setCname(cursor.getString(cursor.getColumnIndex(Constants.CNAME)));
			comic.setChapter(cursor.getInt(cursor.getColumnIndex(Constants.CHAPTER)));
			comic.setCover_url(cursor.getString(cursor.getColumnIndex(Constants.COVER_URL)));
			comic.setAuthor(cursor.getString(cursor.getColumnIndex(Constants.AUTHOR)));
			comic.setFighting(cursor.getInt(cursor.getColumnIndex(Constants.FIGHTING)));
			comic.setDescribe(cursor.getString(cursor.getColumnIndex(Constants.DESCRIBE)));
			comic.setScore(cursor.getFloat(cursor.getColumnIndex(Constants.SCORE)));
			comic.setComments(cursor.getInt(cursor.getColumnIndex(Constants.COMMENTS)));
			comic.setCover_width(300 );
			comic.setCover_height(200 + 10 * i);
			comicList.add(comic);
			i++;
		}
		return comicList;
	}
	
	/**
	 * 获取搜索栏目分类
	 */
	public static ArrayList<CateEntity> getCate(Context context){
		ArrayList<CateEntity> list = new ArrayList<CateEntity>();
		Cursor cursor = null;
		cursor = DBUtil.getInstance(context, DBHelper.TABLE_CATE).selectData(null, null, null, null, null, null);
		while(cursor.moveToNext()){
			CateEntity cate = new CateEntity();
			cate.setId(cursor.getInt(cursor.getColumnIndex(Constants.CID)));
			cate.setName(cursor.getString(cursor.getColumnIndex(Constants.CNAME)));
			cate.setImg_url(cursor.getString(cursor.getColumnIndex(Constants.IMG_URL)));
			list.add(cate);
		}
		return list;
	}
}
