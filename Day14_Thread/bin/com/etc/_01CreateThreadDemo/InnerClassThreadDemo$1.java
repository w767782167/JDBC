// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   InnerClassThreadDemo.java

package com.etc._01CreateThreadDemo;

import java.io.PrintStream;

// Referenced classes of package com.etc._01CreateThreadDemo:
//			InnerClassThreadDemo

class InnerClassThreadDemo$1
	implements Runnable
{

	public void run()
	{
		for (int j = 0; j < 500; j++)
		{
			System.out.println((new StringBuilder("ÌýÒôÀÖ")).append(j).toString());
			try
			{
				Thread.sleep(500L);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}

	InnerClassThreadDemo$1()
	{
	}
}
