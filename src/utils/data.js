export function createRandomInt() {
    return Math.floor(Math.random() * 100)
}

export function formatTime(seconds) {
    // 计算小时数
    const hours = Math.floor(seconds / 3600);
    // 计算剩余的分钟数
    const minutes = Math.floor((seconds % 3600) / 60);
    // 计算剩余的秒数
    const secs = seconds % 60;

    // 格式化为两位数
    const formattedHours = String(hours).padStart(2, '0');
    const formattedMinutes = String(minutes).padStart(2, '0');
    const formattedSeconds = String(secs).padStart(2, '0');

    // 返回格式化的时间字符串
    return `${formattedHours}小时 ${formattedMinutes}分 ${formattedSeconds}秒`;
}