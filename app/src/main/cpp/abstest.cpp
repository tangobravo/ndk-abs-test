#include <cstdlib>
#include <cmath>

#include <jni.h>


extern "C" JNIEXPORT double JNICALL
Java_com_example_abstest_MainActivity_globalAbsTestDouble(
        JNIEnv *env,
        jobject /* this */,
        jdouble val)
{
    return abs(val);
}

extern "C" JNIEXPORT double JNICALL
Java_com_example_abstest_MainActivity_absTestDouble(
        JNIEnv *env,
        jobject /* this */,
		jdouble val)
{
	return std::abs(val);
}

extern "C" JNIEXPORT float JNICALL
Java_com_example_abstest_MainActivity_absTestFloat(
		JNIEnv *env,
		jobject /* this */,
		jfloat val)
{
	return std::abs(val);
}

extern "C" JNIEXPORT jint JNICALL
Java_com_example_abstest_MainActivity_absTestInt(
        JNIEnv *env,
        jobject /* this */,
        jint val)
{
    return  std::abs(val);
}
